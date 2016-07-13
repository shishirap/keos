<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-80716845-1', 'auto');
  ga('send', 'pageview');

</script>
</head>
<body>
	<h2>Home</h2>

	<a href="<c:url value="/dashboard/pages/dashboard.html"/>">dash
		board</a>
	<a href="userController/getUserDetails">user details</a>
	<a href="<c:url value="/dashboard/pages/login.html"/>">Login dash
		board</a>
</body>

<!-- <div class="fb-share-button"
	data-href="https://developers.facebook.com/docs/plugins/"
	data-layout="button_count" data-mobile-iframe="true"></div>


<div id="fb-root"></div> -->

<!-- <script>
	(function(d, s, id) {
		var js, fjs = d.getElementsByTagName(s)[0];
		if (d.getElementById(id))
			return;
		js = d.createElement(s);
		js.id = id;
		js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.6";
		fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));
</script> -->
</html>
