package correo

class Post_meta {
    
    String key //Varchar(50)
    String content //Text
    
    static belongsTo = [postId:Post]
    
    static constraints = {
        key(nullable:false, unique:true)
        content(blank:true, nullable:true)
    }
}
