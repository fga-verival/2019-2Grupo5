from rest_framework import serializers
from text.models import (
    Category,
    Text,
    TextFragment,
    Review,
    Notification,
)

""" Category."""


class CategorySerializerAddAndUpdate(serializers.ModelSerializer):
    class Meta:
        model = Category
        fields = [
            'category_name',
            'category_description'
        ]


class CategorySerializerList(serializers.ModelSerializer):
    class Meta:
        model = Category
        fields = '__all__'


""" Text."""


class TextSerializerAddAndUpdate(serializers.ModelSerializer):
    class Meta:
        model = Text
        fields = [
            'id',
            'author',
            'total_fragments',
            'fragments_done',
            'price',
            'deadline',
            'title',
            'context',
            'language',
            'categories',
            'level',
        ]


class TextSerializerList(serializers.ModelSerializer):
    class Meta:
        model = Text
        fields = '__all__'


""" Fragment."""


class TextFragmentSerializerAddAndUpdate(serializers.ModelSerializer):
    class Meta:
        model = TextFragment
        fields = [
            'text',
            'body',
            'price',
            'state',
            'total_reviews',
            'total_words',
        ]


class TextFragmentSerializerList(serializers.ModelSerializer):
    text = TextSerializerList()
    class Meta:
        model = TextFragment
        fields = "__all__"


class TextFragmentAddTranslatorSerializer(serializers.ModelSerializer):
    class Meta:
        model = TextFragment
        fields = [
            'fragment_translator',
        ]


class TextFragmentUpdateTranslate(serializers.ModelSerializer):
    class Meta:
        model = TextFragment
        fields = [
            'translated_fragment',
        ]

""" Review."""


class ReviewSerializerAddAndUpdate(serializers.ModelSerializer):
    class Meta:
        model = Review
        fields = [
            'id',
            'fragment',
            'review_username',
            'comment',
            'approve',
        ]


class ReviewSerializerList(serializers.ModelSerializer):
    class Meta:
        model = Review
        fields = "__all__"


""" Notification."""

class NotificationSerializer(serializers.ModelSerializer):
    class Meta:
        model = Notification
        fields = "__all__"
