fun main() {
//    val api: ApiService =KtHttpV2.create<ApiService>()
//    val data: RepoList = api.repos(lang = "Kotlin", since = "weekly")
//    println(data)
    val data= KtHttpV2.create<ApiService>().repos(
        lang = "Kotlin",
        since = "weekly"
    )

    println(data)
}

