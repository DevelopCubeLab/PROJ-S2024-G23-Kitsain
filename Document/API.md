# PROJ-S2024-G23-Kitsain API Document

V1.0

## User

### 1. Login
	[post]
	/user/login
### 2. Register
	[post]
	/user/register
### 3. use Google Account login
	[post]
	/user/loginwith
### 4. show user info
	[get]
	/user/info

## Discounted forum

### 1. Forum list
	[get]
	/forum/content
### 2. Post content
	[put]
	/forum/content
### 3. Check post content
	[get]
	/forum/content/{contentId}
### 4. Send comment
	[post]
	/forum/comment
### 5. Send comment reply
	[post]
	/forum/comment/reply
### 6. like / unlike content
	[put]
	/forum/comment/like
### 7. like / unlike reply
	[put]
	/forum/comment/reply/like
### 8. userful / unuseful content
	[put]
	/forum/comment/useful
### 9. delete content
	[delete]
	/forum/content
### 10. delete comment
	[delete]
	/forum/comment
### 11. delete comment reply
	[delete]
	/forum/comment/reply
### 12. Serach comment
	[post]
	/forum/search
	
## Food manager
If data save in back-end sever

### 1. Item list
	[get]
	/item
### 2. Add item
	[post]
	/item
### 3. Search item by code
	[get]
	/item/searchCode
### 2. Delete item
	[delete]
	/item
### 3. Edit item
	[put]
	/item/{itemId}
### 4. Sort list
	[put]
	/item/sort
### 5. Recipe Search
	[get]
	/item/recipe/search
### 6. Packaging Recycling
	[get]
	/item/packaging/recycling

