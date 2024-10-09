package com.example.blogapplication

import com.google.gson.annotations.SerializedName


data class Meta(

    @SerializedName("jetpack_post_was_ever_published") var jetpackPostWasEverPublished: Boolean? = null,
    @SerializedName("_jetpack_newsletter_access") var JetpackNewsletterAccess: String? = null,
    @SerializedName("_jetpack_dont_email_post_to_subs") var JetpackDontEmailPostToSubs: Boolean? = null,
    @SerializedName("_jetpack_newsletter_tier_id") var JetpackNewsletterTierId: Int? = null,
    @SerializedName("_jetpack_memberships_contains_paywalled_content") var JetpackMembershipsContainsPaywalledContent: Boolean? = null,
    @SerializedName("_jetpack_memberships_contains_paid_content") var JetpackMembershipsContainsPaidContent: Boolean? = null,
    @SerializedName("footnotes") var footnotes: String? = null,
    @SerializedName("jetpack_publicize_message") var jetpackPublicizeMessage: String? = null,
    @SerializedName("jetpack_publicize_feature_enabled") var jetpackPublicizeFeatureEnabled: Boolean? = null,
    @SerializedName("jetpack_social_post_already_shared") var jetpackSocialPostAlreadyShared: Boolean? = null,
    @SerializedName("jetpack_social_options") var jetpackSocialOptions: JetpackSocialOptions? = JetpackSocialOptions()

)