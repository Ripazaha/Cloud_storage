package volkovfedor.cloud_storage_backend.utils;

import volkovfedor.cloud_storage_backend.dto.UserDto;
import volkovfedor.cloud_storage_backend.entity.UserEntity;

public interface MapperUtils {

    UserEntity toUserEntity(UserDto userDto);

    UserDto toUserDto(UserEntity userEntity);

}
