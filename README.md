
# Manual Auth with Bcrypt

#### Lab 14 Hambalieu Jallow

### Task
- Create a server to protect a secret recipe by requiring users to sign up for an account and log in. Users should only be able to see the recipe after they’ve logged in and established an authenticated session.

- Create the authentication system for this server on your own. Do not use Spring’s own built-in auth system.

- Display a user’s username somewhere on the page to indicate to a user that they’re logged in.

- Use Bcrypt to hash and check user passwords.

#### Features and Task

- Create a database.

- Create a table that models users with a username, id, and hashed password.

- Create a table that models posts with a postId, userId and text content.

- Create a table with a 1-to-many relationship between users and posts.

- Authenticate the site so only logged-in users can see posts.

- Use Bcrypt to hash all passwords stored on the site.

### PORT
-Listening on Port 5432

####Time
- The lab took me about 4 hours to complete

### Reference 
- [Class 14 Demo](https://github.com/codefellows/seattle-code-java-401d14/tree/main/class-14/demo/bcryptdemod14/bcryptdemod14)

