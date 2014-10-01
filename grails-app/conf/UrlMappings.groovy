class UrlMappings {

	static mappings = {
        "/all"(controller: "everyResource") {
            action = [DELETE: "delete"]
        }

        "/match_requests/$id"(controller: "matchRequest") {
            action = [GET: "show", PUT: "save"]
        }

        "/results"(controller: "result") {
            action = [POST: "save"]
        }

        "/"(view: "/index")
        "500"(view: '/error')
	}
}
