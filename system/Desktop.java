package org.system;


	public class Desktop extends Computer{
		public void desktopSize() {
			System.out.println("Desktopsize is 20 inches");
		}
		public static void main(String[] args) {
			Desktop system=new Desktop();
			system.computermodel();
			system.desktopSize();
		}
	}



