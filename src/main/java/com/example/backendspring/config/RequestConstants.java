package com.example.backendspring.config;

/**
 * Created by Aleksey Popryaduhin on 16:49 01/10/2017.
 */
public class RequestConstants {
  public static final int SESSION_LENGTH = 20;
  public static final int COOKIE_AGE = 31 * 24 * 60 * 60;
  public static final String ANONYMOUS_SESSION_HEADER = "anonymous-session";
  public static final String USER_SESSION_HEADER = "user-session";
  public static final String USER_AUTHORITIES_HEADER = "user-authorities";
  public static final String ACCESS_TOKEN_HEADER = "access-token";
}
