
public class ClasseInterna {

	public class Outer {
		private String outerName = "outer";
		public class Inner {
			private String innerName = "inner";
			public void saluta() {
				return innerName + " " + outerName;
			}
		}
	}
}
