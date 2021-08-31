
public enum Direction {
	NORD() { 
		@Override public Direction opposta() {
			return SUD; 
		}
	},
	OVEST() {
		@Override public Direction opposta() { 
			return EST;
		}
	}, SUD {
		@Override
		public Direction opposta() {
			return SUD;
		}
	}, EST {
		@Override
		public Direction opposta() {
			return EST;
		}
	};
	public abstract Direction opposta();
}

