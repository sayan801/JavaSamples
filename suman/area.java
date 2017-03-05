/*http://ideone.com/0zwPzb
*solve a area 
*/


class Room
{
	float length;
	float width;

	void getdata(float a,float b)
	{
		length = a;
		width = b;
	}
}

class RoomArea
{
	public static void main(String args[])
	{
		float area;
		
		Room room1 = new Room();
		room1.getdata(15,10);
		
		area = room1.length*room1.width;
		System.out.println("Area =" +area);
	}
}
