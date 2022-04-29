package correo

class Category {
    
    Category parentId
    String title //Varchar(75)
    String metaTitle //Varchar(100)
    String slug //Varchar(100)
    String content //TEXT
    
    static belongsTo = [parentId:Post_category]
    
    static constraints = {
        
        title(nullable:false, unique:true)
        metaTitle(blank:true, nullable:true)
        slug(blank:true, nullable:false)
        content(blank:true, nullable:true)
        
    }
}
