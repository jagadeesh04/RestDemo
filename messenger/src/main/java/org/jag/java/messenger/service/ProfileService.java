package org.jag.java.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jag.java.messenger.database.DatabaseClass;
import org.jag.java.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){
		profiles.put("jag", new Profile(1L,"jag", "jaga", "Denn"));
		profiles.put("ram", new Profile(2L,"ram", "Ram", "Kotte"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(),profile);
	return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty()){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
	
}
