package com.example.springboot_fullstack_app.payload;

public class AuthenticationResponse {

	    private String message;
	    private boolean success;

	    public AuthenticationResponse() {
	    }

	    public AuthenticationResponse(String message, boolean success) {
	        this.message = message;
	        this.success = success;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public boolean isSuccess() {
	        return success;
	    }

	    public void setSuccess(boolean success) {
	        this.success = success;
	    }
}
