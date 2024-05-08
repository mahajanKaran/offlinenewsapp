package com.karan.newsapp.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.karan.newsapp.data.database.entity.Source
import com.karan.newsapp.data.model.Country
import com.karan.newsapp.data.model.Language
import com.karan.newsapp.ui.components.CountryItem
import com.karan.newsapp.ui.components.LanguageItem
import com.karan.newsapp.ui.components.SourceItem


@Composable
fun CountryListLayout(
    countryList: List<Country>,
    countryClicked: (Country) -> Unit
) {
    LazyColumn {
        items(countryList) {
            CountryItem(it) { country ->
                countryClicked(country)
            }
        }
    }
}

@Composable
fun LanguageListLayout(
    languageList: List<Language>,
    languageClicked: (Language) -> Unit
) {
    LazyColumn {
        items(languageList) {
            LanguageItem(it) { language ->
                languageClicked(language)
            }
        }
    }
}

@Composable
fun SourceListLayout(
    sourceList: List<Source>,
    sourceClicked: (Source) -> Unit
) {
    LazyColumn {
        items(sourceList) {
            SourceItem(it) { source ->
                sourceClicked(source)
            }
        }
    }
}