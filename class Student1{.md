class Student1{

String name;

int year;

Student1(String name,int year){

this.name=name;

this.year=year;

}

void show(){

System.out.println("Name:"+name+"year:"+year);

}

class UGStudent extends Student ( String branch){

UGStudent(String name, int year, String branch) {

 super(name, year);

 this.branch = branch;

}

@Override

void showDetails() {

 System.out.printin("UG Student:"+ + name + ", Year:" + year +", Branch:" + branch);

}

}C

