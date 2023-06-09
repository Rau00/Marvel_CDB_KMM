package com.ragnorak.marvelcdb.data.repositories

import com.ragnorak.marvelcdb.data.datasource.cloud.MarvelCardsDataSource
import com.ragnorak.marvelcdb.data.datasource.responses.MarvelCardResponse

internal class MarvelCardRepositoryImpl(
    private val marvelCardsDataSource: MarvelCardsDataSource
) : MarvelCardRepository {

    override suspend fun getMarvelCardList(): Result<List<MarvelCardResponse>> =
        marvelCardsDataSource.getMarvelCardList()
}