
public class Functions {

	// Faça somente 1 coisa
    //A
    public void saveIncome(Income income){
        inRepo.save(income);
    }
    public void saveExpense(Expense expense){
        outRepo.save(expense);
    }

    //Somente 1 nível de abstração
    //B
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.userRepository.save(user);
    }    

    // Arguments
    //A
    public void saveUser(User user){};
    //B
    public void saveUser(String userName, User user, Date date, boolean isAdmin){}; 

    //  No side effects
    //A
    public User saveUser(User user){
      if(user.isAdmin){
      user.setRole(user);
    }
      return userRepository.save(user);
    }

    //B
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void setRole(User user){
        user.setRole(user);     
    }

    // Evite duplicados, extraindo para novos métodos
    //A
    public Environment getEnvironment(){
        String version = versionService.getVersion();
        return environmentService.getEnvironment(version);
    }
    public Release getRelease(){
        String version = versionService.getVersion();
        return releaseService.getRelease(version);
    }

}