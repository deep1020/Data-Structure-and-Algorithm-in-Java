// 1. String objects are stored in string pool and it is possible that multiple references are referring to the same object.
// So if we make it mutable then change in value done by any one reference will also affect the value referred by other references.
// 2. Security: String is made immutable to help to increase security. Sensitive data like username, password can be stored
// as a strings can't be modified once created.
package String;

public class immutable_string {

	public static void main(String[] args) {
		String str="Hello";
		//immutable
		str.concat("world");
		System.out.println(str);

		// mutable
		str=str.concat("world");
		System.out.println(str);

		// StringBuilder mutable
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("world");
		System.out.println(sb.toString());
	}
}
