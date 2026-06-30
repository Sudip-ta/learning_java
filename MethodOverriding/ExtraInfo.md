## Why can't we store the object of a different class in the reference variable of a completely unrelated class, despite refence variables being only a container that basically stores the reference(address) of an object?

It comes down to type safety and memory management, Java is a stsrongly typed language. 

A reference variable isn't only a blind pointer. it's a promise of what we can find at the reference.

Suppose we have two complete unrelated class Dog and Car

`class Dog {
    void bark() { System.out.println("Woof!"); }
}

class Car {
    void accelerate() { System.out.println("Vroom!"); }
}`

If Java allowed you to do this:

`Dog myDog = new Car(); // ❌ Hypothetically allowed for a moment`

The variable myDog now holds the address to a Car object in memory. Because the compiler looks at the variable type (Dog), it thinks everything is fine if you write:

`myDog.bark(); `
At runtime, the CPU jumps to that memory address, looks for the bark() instruction inside the Car object, and finds... total gibberish, or a completely different instruction like accelerate(). This would instantly crash the JVM or corrupt your data.

To protect you, the Java compiler acts as a bouncer. It says: "I will only let you store an address here if I can guarantee that the object at that address matches this variable's blueprint."

### Why it does work for Parent and Child
So, why does Parent p = new Child(); work, but Class A = new Class B(); fails?

Because of Inheritance. Inheritance creates an "IS-A" relationship.

`class Animal { void eat() {} }
class Dog extends Animal { void bark() {} }`

When a Dog object is created in memory, it doesn't just contain dog features—it physically wraps and includes the Animal blueprint inside it.

Because a Dog is an Animal, Java can guarantee with 100% certainty that if you use an Animal reference, the eat() method will absolutely exist at that memory address.