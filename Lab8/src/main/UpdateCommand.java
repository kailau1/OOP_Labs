package main;

import model.*;
public class UpdateCommand implements Command {

    private final String name;

    private final String phoneNumber;

    public UpdateCommand(String[] parts) throws InvalidCommandException {
        if (parts.length != 3) {
            throw new InvalidCommandException();
        }
        this.name = parts[1];
        this.phoneNumber = parts[2];
    }


    @Override
    public void execute(PhoneBook phoneBook) throws NotPresentException {
        phoneBook.updateEntry(name, phoneNumber);
        System.out.println("Entry updated.");
    }
}