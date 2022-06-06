class Student:Human {
    private var schoolName:String?= null
    private var schoolId:Int?= null
    private var major:String?= null

    constructor(name:String,age:Int,gender:String,
                schoolName:String,schoolId:Int,major:String):super(name,age,gender){

        this.schoolName=schoolName
        this.schoolId=schoolId
        this.major=major
    }

}