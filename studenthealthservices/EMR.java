/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthealthservices;

/**
 *
 * @author daisysun
 */

public class EMR { 
    //instant variables
    private String name;
    private String bday;
    private String reasonforvisit;
    private double bodytemp;
    private double heartrate;
    private String diagnosis;
    private String prescribedMed;
    public static int patientobj; //static variable for patient count
    
    EMR(){ //default constructor
        patientobj++; //counter
    }
    
    EMR(String pname, String pdob){ //constructor - name bd
        name = pname;
        bday = pdob; 
        patientobj++;
    }
    //constructor for all data fields
    EMR(String pname, String pdob, String pwhy, double phot, double doki, String pdiag, String pmed){
        name = pname;
        bday = pdob;
        reasonforvisit = pwhy;
        bodytemp = phot;
        heartrate = doki;
        diagnosis = pdiag;
        prescribedMed = pmed;
        patientobj++;
    }
   
    
    
public void setName (String nName){ //set name
    name = nName;
}
public void setDoB (String nDoB){ //setter for bday
    bday = nDoB;
}
public void setReason (String why){ //setter for visit
    reasonforvisit = why;
}
public void setTemp (double temp){ //setter for body temp
    bodytemp = temp;
}
public void setHeartrate (double hr){ //setter for heartrate
    heartrate = hr;
}
public void setDiagnosis (String what){ //setter for diagn
    diagnosis = what; 
}
public void setMedicine (String cure){ //settter for med
    prescribedMed = cure;
}
        
public String getName (){ //getter for getting name
    return name; 
}
public String getDoB(){ //getter for get bday
    return bday;
}
public String getReason(){ //getter for get reason 
    return reasonforvisit;
}
public double getTemp(){ //getter for get temp
    return bodytemp;
}
public double getHeartrate(){ //getter for heartrate
    return heartrate;
}
public String getDiagnosed(){ //getter for diagnosis
    return diagnosis;
}
public String getMeds(){ //getter for medicine prescription
    return prescribedMed;
}

public int getPatientcnt (){ //getter for patientcount
    return patientobj;
}

public boolean redFlags(){ //instance method 
    if((heartrate < 60 || heartrate > 100) 
        || (bodytemp < 97.3 || bodytemp > 99.1)){
     return true;
}else{
        return false;
    }
}
   
public String toString (){
      String strung = (name + bday + reasonforvisit + bodytemp + heartrate + diagnosis + prescribedMed);
      return strung;
}
}



