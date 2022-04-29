package correo

class Post {

    Post parent
    String title
    String metaTitle
    String slug
    String summary
    int published
    Date createAt = new Date()
    Date updateAt = new Date()
    Date publishedAt = new Date()
    String content
    
    //Relacion uno a muchos
    static belongsTo = [author:User]
    
    static constraints = {
        title(nullable:false, unique:true)
        metaTitle(blank:true, nullable:true)
        slug(blank:true, nullable:false)
        summary(blank:true, nullable:true)
        published(nullable:false)
        createAt(nullable:false)
        content(blank:true, nullable:true)
    }
}
