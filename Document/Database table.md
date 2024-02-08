# PROJ-S2024-G23-Kitsain Back-end Database table Document

## User
	
	id
	[int]
	🔑primary key
	*Automatically increase
	
	username
	[string]
	*unique
	
	password
	[string]
	
	email
	[string]
	*unique
	
	register_date
	[datetime]
	
	
## Forum
	
	id
	[int]
	🔑primary key
	*Automatically increase
	
	send_userId
	[int]
	
	title
	[string]
	
	content
	[string]
	
	imageSrc
	[string]
	
	send_time
	[datetime]
	
	send_ip
	[string]
	
	send_location_lat
	[float]
	
	send_location_lon
	[float]
	
	market
	[string]
	
	like_num
	[int]
	
	useful_num
	[int]
	
## Comment
	
	id
	[int]
	🔑primary key
	*Automatically increase
	
	contentId
	[int]
	
	send_userId
	[int]
	
	send_time
	[datetime]
	
	send_ip
	[string]
	
	content
	[string]
	
	imageSrc
	[string]
	
## Comment reply

	id
	[int]
	🔑primary key
	*Automatically increase
	
	commentId
	[int]
	
	send_userId
	[int]
	
	send_time
	[datetime]
	
	send_ip
	[string]
	
	content
	[string]
	
	imageSrc
	[string]
	
## Item

	id
	[int]
	🔑primary key
	*Automatically increase
	
	userId
	[int]
	
	name
	[string]
	
	categoryId
	[int]
	
	imageSrc
	[string]
	
	add_time
	[datetime]
	
	expired_time
	[datetime]
	

## Item Category

	id
	[int]
	🔑primary key
	*Automatically increase
	
	category_name
	[string]
	
	icon_src
	[string]