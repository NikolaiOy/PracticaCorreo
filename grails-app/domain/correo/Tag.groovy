package correo

class Tag {
    
    String title //Varchar(75)
    String metatitle //Varchar(100)
    String slug //Varchar(100)
    String content //TEXT
    
    static constraints = {
        title(nullable:false, unique:true)
        metatitle(blank:true, nullable:true)
        slug(blank:true, nullable:false)
        content(blank:true, nullable:true)
    }
}
