package com.bridgelabz.addressbook_systeam.service;

import com.bridgelabz.addressbook_systeam.dto.UserDto;
import com.bridgelabz.addressbook_systeam.dto.UserLocationDTO;
import com.bridgelabz.addressbook_systeam.model.Location;
import com.bridgelabz.addressbook_systeam.model.User;
import com.bridgelabz.addressbook_systeam.repository.LocationRepository;
import com.bridgelabz.addressbook_systeam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LocationRepository locationRepository;

    public List<UserLocationDTO> getAllUsersLocation() {
        return userRepository.findAll()
                .stream().map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public void createAllUserInformation(UserDto userDto) {
        this.convertUserDtoToEntity(userDto);
    }

    private UserLocationDTO convertEntityToDto(User user) {
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }

    private void convertUserDtoToEntity(UserDto userDto) {
        Location location = new Location();
        location.setDescription(userDto.getDescription());
        location.setPlace(userDto.getPlace());
        location.setLongitude(userDto.getLongitude());
        location.setLatitude(userDto.getLatitude());
        locationRepository.save(location);
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setLocation(location);
        userRepository.save(user);
    }

}
