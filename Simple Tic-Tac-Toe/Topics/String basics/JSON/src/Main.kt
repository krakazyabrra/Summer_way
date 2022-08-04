fun main() {
    //put your code here
    val age = 35
    println("""
{
    "firstName": "John",
    "lastName": "Smith",
    "age": """+age +""",
    "phoneNumbers": [
        {
            "type": "mobile",
            "number": "123 567-7890"
        }
    ]
}""")
}