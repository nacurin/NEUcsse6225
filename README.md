#APIs  
EBS Link: `Test2-env.xkcbwn3xgw.us-west-2.elasticbeanstalk.com`  
  
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
- PUT /webapi/professors/{id}  
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
/webapi/students  
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
- PUT   
/webapi/programs/{id}  
`{
    "courses": [
        {
            "board": "default board",
            "courseId": 0,
            "lectures": [
                {
                    "lectureId": 0,
                    "material": "no image",
                    "name": "7000",
                    "notes": "Jackie"
                }
            ],
            "professor": 111,
            "roster": "roster",
            "studentTA": 0,
            "students": [
                1
            ]
        }
    ],
    "courseId": 1
}`  
- DEL
/webapi/courses/{id}  

Course

- GET
/webapi/courses
- POST
/webapi/courses  
`{
            "board": "default",
            "courseId": 0,
            "lectures": [
                {
                    "lectureId": 1,
                    "material": "no image",
                    "notes": "lalaland"
                }
            ],
            "professor": 111,
            "roster": "roster",
            "studentTA": 0,
            "students": [
                1
            ]
}`
- PUT   
/webapi/courses/{id}  
`{
            "board": "default board",
            "courseId": 0,
            "lectures": [
                {
                    "lectureId": 0,
                    "material": "no image",
                    "notes": "Mia"
                }
            ],
            "professor": 111,
            "roster": "LALALAND",
            "studentTA": 0,
            "students": [
                1
            ]
        }`  
- DEL
/webapi/courses/{id}  
