public class Error {

    // Use Exceptions ao invés de returnar código
    //A
    public User createUser(User user){
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId())
        }
        catch (UserNotFoundException exception){
            // detail here
        }
        resolveGroup(user);
        return userRepository.save(user);
    }


    // Exceções com contexto
    //A
    public void validate(String id){
        if(ownerRepo.count(id) == 0){
            throw new ValidationException("ocorreu uma exceção ...")
        }
    }


    // Não retorne nulle não passe null
    //B
    public User createUser(User user){

        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId())
        }
        catch (UserNotFoundException exception){
            // detail here
        }

        resolveGroup(user);
        return userRepository.save(user);
    }

}
