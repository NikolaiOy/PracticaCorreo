package correo

class Post_comment {

    
    Post_comment parentId //BIGINT(20)
    String title //Varchar(100)
    String published //TINYINT(1)
    Date createAt = new Date() //DATETIME
    Date publishedAt = new Date() //DATETIME
    String content //TEXT
   
    static belongsTo = [postId:Post]
    
    static constraints = {
        
        title(nullable:false, unique:true)
        published(nullable:false)
        createAt(nullable:false)
        publishedAt(nullable:true)
        content(blank:true, nullable:true)
    }
}
