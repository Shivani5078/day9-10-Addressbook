 public void removeContactDetails() {
			
			System.out.println("Enter the contact details:");
			System.out.println("Enter the first name:");
			String firstName = sc.next();
					
			for(Contact cont : contactList) {
				if(cont.getFirstname().equals(firstName)) {
					contactList.remove(cont);
				}
			}		
		}
