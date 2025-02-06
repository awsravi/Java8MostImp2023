package com.stream.javatechie8.com.awsravi.it;

public class ExtractedIPAddresNormal {
	
	
	    public static void main(String[] args) {
	        String org = "Pipeline-process-10.123.12.1-base";

	        String[] parts = org.split("-");
	        for (String part : parts) {
	            if (isValidIPAddress(part)) {
	                System.out.println("Extracted IP address: " + part);
	                break; 
	            }
	        }
	    }

	    public static boolean isValidIPAddress(String str) {
	        String[] octets = str.split("\\.");
	        if (octets.length != 4) {
	            return false;
	        }
	        for (String octet : octets) {
	            try {
	                int octetValue = Integer.parseInt(octet);
	                if (octetValue < 0 || octetValue > 255) {
	                    return false;
	                }
	            } catch (NumberFormatException e) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

