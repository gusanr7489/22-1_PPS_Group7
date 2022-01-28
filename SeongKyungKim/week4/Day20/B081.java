class Solution {
    public boolean divisorGame(int n) {
        boolean result;
	     int who=0;
	     boolean find = true;
	     while(true) {
	    	 find = false;
	    	 for(int i=1; i<n; i++) {
	    		 if(n%i==0) {
	    			 n = n-i;
	    			 find = true;
	    			 break;
	    		 }
	    	 }
	    	 if(!find) {
	    		 break;
	    	 }
	    	 who++;
	     }
	     
	     if(who%2 !=0) result = true;
	     else result = false;
	    
	     return result;
    }
}
