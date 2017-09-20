package com.lol.empty;


public class UserExtInfoDataItemsRecentKda {
	    private int k_num;
	    private int d_num;
	    private int a_num;
	    private int win_num;
	    private int use_num;
	    private int day;
		
	    
	    public UserExtInfoDataItemsRecentKda(int k_num, int d_num, int a_num, int win_num, int use_num, int day) {
			super();
			this.k_num = k_num;
			this.d_num = d_num;
			this.a_num = a_num;
			this.win_num = win_num;
			this.use_num = use_num;
			this.day = day;
		}

		@Override
		public String toString() {
			return "UserExtInfoDataItemsRecentKda [k_num=" + k_num + ", d_num=" + d_num + ", a_num=" + a_num
					+ ", win_num=" + win_num + ", use_num=" + use_num + ", day=" + day + "]";
		}

		public int getK_num() {
			return k_num;
		}

		public void setK_num(int k_num) {
			this.k_num = k_num;
		}

		public int getD_num() {
			return d_num;
		}

		public void setD_num(int d_num) {
			this.d_num = d_num;
		}

		public int getA_num() {
			return a_num;
		}

		public void setA_num(int a_num) {
			this.a_num = a_num;
		}

		public int getWin_num() {
			return win_num;
		}

		public void setWin_num(int win_num) {
			this.win_num = win_num;
		}

		public int getUse_num() {
			return use_num;
		}

		public void setUse_num(int use_num) {
			this.use_num = use_num;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public UserExtInfoDataItemsRecentKda() {
			// TODO Auto-generated constructor stub
		}
}
