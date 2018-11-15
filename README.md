#APIs  
EBS Link: `Test2-env.xkcbwn3xgw.us-west-2.elasticbeanstalk.com`  
  
Professor  

- GET
/webapi/professors
- POST
/webapi/professors  
{ 
	"firstName":	"Ozpin the second", 
	"lastName": "Ozma",
	"department":	"headmaster", 
	"professorId":	"prof.ozp", 
	"joiningDate":	"2019-04-06T16:00:05"
} 
- PUT /webapi/professors/{id}  
`{ 
	"firstName":	"nobody", 
	"lastName": "who",
	"department":	"headmaster", 
	"joiningDate":	"2016-04-06T16:00:05"
}` 
- DEL
`/webapi/professors/{id}`

Student  

- GET
/webapi/students  
- POST
/webapi/students  
`{
	"studentId":	"wis.sch",
	"firstName":	"Weiss",
	"lastName":	"Schnee",
	"joiningDate":	"8102",
	"registeredCourses":	["mgc101", "ice102"],
	"department":	"hunter"
}`
- PUT 
/webapi/students/{id}  
`{
	"firstName":	"who",
	"lastName":	"who",
	"joiningDate":	"8102",
	"registeredCourses":	["mgc101"],
	"department":	"art"
}`  
- DEL  
/webapi/students/{id}

Boards

- GET
/webapi/boards
- POST
/webapi/boards  
`{
    "announcements": [
        "123123",
        "123124"
    ],
    "boardId": "33",
    "courseId": "11"
}`
- PUT   
/webapi/boards/{id}  
`{
    "announcements": [
        "0000",
    ]
}`  
- DEL
/webapi/boards/{id}  

Course

- GET
/webapi/courses
- POST
/webapi/courses  
`{
            "boardId": "default",
            "courseId": "mgc101",
            "professorId": "111",
            "department": "magic",
            "TAId": 0,
            "enrolledStudent": [
                "rub.ros",
                "jau.arc"
            ]
}`
- PUT   
/webapi/courses/{id}  
`{
            "department": "general",
            "enrolledStudent": [
                "jau.arc"
            ]
}`  
- DEL
/webapi/courses/{id}  

Course

- GET
/webapi/announcements
- POST
/webapi/announcements
`{
	"boardId": 		"33",
	"announcementId":	"111",
	"announcementText": 	"blabla"
}`  
- PUT   
/webapi/courses/{boardId}\_{anouncementId}
`{
	"announcementText": 	"biubiubiu"
}`
- DEL   
/webapi/courses/{boardId}\_{anouncementId}
