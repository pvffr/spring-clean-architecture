package pl.gov.coi.cleanarchitecture.example.spring.pets.domain.model.gateway;

import pl.gov.coi.cleanarchitecture.example.spring.pets.domain.model.entity.Person;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 24.04.18
 */
public enum PersonFetchProfile implements FetchProfile<Person> {
  SOLE, WITH_OWNERSHIPS
}
