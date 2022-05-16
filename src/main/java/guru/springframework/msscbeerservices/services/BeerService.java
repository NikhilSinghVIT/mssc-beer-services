package guru.springframework.msscbeerservices.services;

import guru.springframework.msscbeerservices.web.model.BeerDto;
import guru.springframework.msscbeerservices.web.model.BeerPagedList;
import guru.springframework.msscbeerservices.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest0);
}
