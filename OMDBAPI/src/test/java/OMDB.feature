

Feature: Finding Films using OMDB api

	Scenario: Finding Dunkirk
	Given Dunkirk is on OMDB
	When I retrieve the film
	Then The year is 2017
