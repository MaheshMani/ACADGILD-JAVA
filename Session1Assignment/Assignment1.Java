class Assignment1 {

public static void main(String[] args){

//Declaring variables
int result;
int a;
float b;

/*assiging values to the variables (when we need to 
assigin float value to the variable it should be sufix  with "f", 
otherwise system will treat it as double.*/

a=5;
b=6.5f;

//Typecasting downgrade from Float to Integer
//Integer.ParseInt will be used only for String value

result=a+(int)b;


//Extracting the result
System.out.println (result);

}
}


