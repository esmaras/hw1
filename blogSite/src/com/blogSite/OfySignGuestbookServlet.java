package com.blogSite;
//http://1-dot-guestbook-1057.appspot.com/.ofyguestbook.jsp

import com.googlecode.objectify.ObjectifyService;

import static com.googlecode.objectify.ObjectifyService.ofy;

import com.google.appengine.api.datastore.Entity;

import com.google.appengine.api.datastore.Key;

import com.google.appengine.api.datastore.KeyFactory;

import com.google.appengine.api.users.User;

import com.google.appengine.api.users.UserService;

import com.google.appengine.api.users.UserServiceFactory;

import com.blogSite.BlogSite;

import java.io.IOException;

import java.util.Date;



import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



public class OfySignGuestbookServlet extends HttpServlet {

      static {

      ObjectifyService.register(Greeting.class);

  }

      public void doPost(HttpServletRequest req, HttpServletResponse resp)

              throws IOException {