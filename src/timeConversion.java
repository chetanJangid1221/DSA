public class timeConversion {
	public static void main(String[] args) {
		String s = "12:30:00AM";
		String hour = s.substring(0, 2);
        String min=s.substring(3,5);
        String sec= s.substring(6, 8);
        String day = s.substring(8, 10);
        System.out.println(day);
        System.out.println(hour);
        String ans;
        if(day.equals("PM")) {
            switch (hour) {
            case "12": {
                ans="12"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "01": {
                ans="13"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "02": {
                ans="14"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "03": {
                ans="15"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "04": {
                ans="16"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "05": {
                ans="17"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "06": {
                ans="18"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "07": {
                ans="19"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "08": {
                ans="20"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "09": {
                ans="21"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "10": {
                ans="22"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            case "11": {
                ans="23"+":"+min+":"+sec;
                System.out.println("Time in 24 hr formate is "+ans);
                
                break;
            }
            
            default:
                throw new IllegalArgumentException("Unexpected value: " + hour);
            }
           
        }
        else if(hour.equals("12") && day.equals("AM")){
            
            ans="00"+":"+min+":"+sec;
          System.out.println(ans);
        }
        else {
            ans=s.substring(0, 8);
            System.out.println(ans);
        }

    }

	}
	
	
