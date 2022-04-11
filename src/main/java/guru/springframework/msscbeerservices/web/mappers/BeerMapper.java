package guru.springframework.msscbeerservices.web.mappers;

import guru.springframework.msscbeerservices.domain.Beer;
import guru.springframework.msscbeerservices.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
