#APIs  

Professor  

- GET
/webapi/professors
- POST
/webapi/professors  
`{
	"firstName":	"A",
	"department":	"B",
	"professorId":	"12",
	"joiningDate":	"2016-04-06T16:00:05"
}`  
- PUT
/webapi/professors/{id}  
`{
    "department": "cs",
    "firstName": "Kevin",
    "joiningDate": "2016-04-02T16:00:05",
    "professorId": 2
}` 
- DEL
`/webapi/professors/{id}`

Student  

- GET
/webapi/student  
- POST
/webapi/students  
`{
	"name":		"Jackie",
	"image":	"no image",
	"coursesEnrolled":	"101",
	"programName":	"art"
}`
- PUT 
/webapi/students/{id}
`{
	"name":		"Jackie",
	"image":	"no image",
	"coursesEnrolled":	"101",
	"programName":	"art"
}`  
- DEL  
/webapi/lectures/{id}
- PUT /webapi/lectures/{id}
`{
	"notes":		"Jackie Chen",
	"material":		"new image"
}`  
Program

- GET
/webapi/programs
- POST
/webapi/programs  
`{
	"courses": [
		{
		"lectures":		[{
						"notes":		"Jackie",
						"material":		"no image"
						}],
		"board":		"default board",
		"roster":		"roster",
		"students":		["1"],
		"professor":	"111",
		"studentsTA":	"22"
		}
	]
}`
