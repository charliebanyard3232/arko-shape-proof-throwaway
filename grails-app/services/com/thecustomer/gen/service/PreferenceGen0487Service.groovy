// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen0487Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 5825 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 8627 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 5873 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 7897 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 4007 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 6217 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 1400 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 8768 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 1983 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 6328 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 1328 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 6853 }
    /** Derived accessor for priority (generated filler). */
    def computePriority12() { return 9844 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 7351 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 3881 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName15() { return 7681 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn16() { return 5497 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn17() { return 9087 }
}
