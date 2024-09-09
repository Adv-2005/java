package lab7;
import com.course.structure.*;
public class q1 {
	public static void main(String[] args) {
		Building building = new Building(50,3); 
		House house = new House(50,2,2,1);
		School school = new School(50,2,10,"5th");
		System.out.println("Building: "+ building.getSquareFootage()+ " sqft, " + building.getStories()+ " stories" );
		System.out.println("House: " + house.getSquareFootage() + " sqft, " + house.getStories() + " stories, " + house.getBedrooms() + " bedrooms, " + house.getBaths() + " baths");
		System.out.println("School: " + school.getSquareFootage() + " sqft, " + school.getStories() + " stories, " + school.getClassrooms() + " classrooms, " + school.getGradeLevel() + " level");
	}
}
