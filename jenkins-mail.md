
Jenkins Email Notification:
- You need to allow less secure apps, you can do it by click below link **https://www.google.com/settings/security/lesssecureapps**
- Also try this one **https://accounts.google.com/DisplayUnlockCaptcha**


Plugins:
- Email Extension Plugin
- Email Extension Template Plugin
		
Manage Jenkins --> Configure System -->Extended E-mail Notification	

- SMTP server: smtp.gmail.com
 Use SMTP Authentication
- User Name			 : atulyw@gmail.com
- Password			 : ***************
- Use SSL				 : [x]
- SMTP port			 : 465
- Default Content Type : HTML
- Default Recipients   : cc:cloudblitzinfo@gmail.com
- Default Subject      : $PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!
- Default Content      : ```<pre>${BUILD_LOG}</pre>```
- Default Triggers	 : tick all [x]
		

for more customized template use thus file in Default Content
[click-here](mailtemplate.html)