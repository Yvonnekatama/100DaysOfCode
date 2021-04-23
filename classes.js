class Student{
    constructor(name,age,school)
    {
        this.myName=name;
        this.myAge=age;
        this.mySchool=school;
    }

}
let details=new Student("Yvette",20,"AkiraChix");
console.log(details.mySchool);
console.log(details.myName);
console.log(details.myAge);

class User {
    constructor(name,location,department) {
      this.name = name;
      this.location=location;
      this.department=department;
    }
}

let approve=new User("Yvonne","Nairobi","tech");
console.log(approve.name);
console.log(approve.location);
console.log(approve.department);
