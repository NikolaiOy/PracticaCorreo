package correo

class Post_tag {
    
    static belongsTo = [postId:Post, tag:Tag]
    
    static constraints = {
    }
}
