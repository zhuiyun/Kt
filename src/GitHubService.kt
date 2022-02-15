interface GitHubService {
    @GET("/search")
    fun search(
        @Field("id") id: String
    )
}