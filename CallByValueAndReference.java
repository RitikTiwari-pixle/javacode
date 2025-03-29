class Number { 
    int value; 
 
    Number(int value) { 
        this.value = value; 
    } 
} 
 
public class CallByValueAndReference { 
    public static void main(String[] args) { 
        // Call by value example with primitive type 
        int primitiveValue = 10; 
        System.out.println("Before call by value: " + primitiveValue); 
        modifyPrimitive(primitiveValue); 
        System.out.println("After call by value: " + primitiveValue); 
         
        // Call by reference example with object 
        Number objectValue = new Number(10); 
        System.out.println("Before call by reference: " + 
objectValue.value); 
        modifyObject(objectValue); 
        System.out.println("After call by reference: " + objectValue.value); 
    } 
     
    // Method to modify primitive type (call by value) 
    public static void modifyPrimitive(int value) { 
        value = 20; 
    } 
     
    // Method to modify object (reference to object) 
    public static void modifyObject(Number number) { 
        number.value = 20; 
    } 
}