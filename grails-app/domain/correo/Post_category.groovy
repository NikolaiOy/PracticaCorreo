package correo

class Post_category {
    
    static belongsTo = [postId:Post, categoryId:Category]
    
    static constraints = {
    }
}
