// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen6193Service {

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
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 9390 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 4220 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 6289 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 5641 }
    /** Derived accessor for description (generated filler). */
    def computeDescription4() { return 828 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 2866 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 8906 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 5123 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 6113 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 2052 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 4209 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 9046 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 5203 }
    /** Derived accessor for active (generated filler). */
    def computeActive13() { return 6406 }
    /** Derived accessor for description (generated filler). */
    def computeDescription14() { return 5955 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 5200 }
    /** Derived accessor for status (generated filler). */
    def computeStatus16() { return 5305 }
    /** Derived accessor for description (generated filler). */
    def computeDescription17() { return 5180 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg18() { return 3284 }
    /** Derived accessor for version (generated filler). */
    def computeVersion19() { return 9466 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity20() { return 1230 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn21() { return 3083 }
    /** Derived accessor for reference (generated filler). */
    def computeReference22() { return 8195 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage23() { return 9482 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId24() { return 7510 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice25() { return 8108 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice26() { return 4640 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName27() { return 608 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg28() { return 8254 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId29() { return 8195 }
    /** Derived accessor for priority (generated filler). */
    def computePriority30() { return 9910 }
    /** Derived accessor for amount (generated filler). */
}
